public class ImageClassifier {

    // Creates a feature vector (1D array) from the given picture
    public static double[] extractFeatures(Picture picture) {
        int width = picture.width();
        int height = picture.height();
        double[] features = new double[width * height];

        int index = 0;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int grayscaleValue = picture.get(col, row).getRed();
                features[index++] = grayscaleValue;
            }
        }
        return features;
    }

    //
    public static void main(String[] args) {
        // training
        In trainingInput = new In(args[0]);
        In testingInput = new In(args[1]);

        int trainingClassCount = trainingInput.readInt();
        int trainingPicHeight = trainingInput.readInt();
        int trainingPicWidth = trainingInput.readInt();

        MultiPerceptron perceptron =
                new MultiPerceptron(trainingClassCount,
                                    trainingPicWidth * trainingPicHeight);
        double[] extractedTrainingInput;
        while (!trainingInput.isEmpty()) {
            String filename = trainingInput.readString();
            int label = trainingInput.readInt();
            extractedTrainingInput = extractFeatures(new Picture(filename));
            perceptron.trainMulti(extractedTrainingInput, label);
        }

        // testing
        testingInput.readInt();
        testingInput.readInt();
        testingInput.readInt();
        int countTotal = 0;
        int countWrong = 0;

        double[] extractedTestingInput;

        while (!testingInput.isEmpty()) {
            String filename = testingInput.readString();
            int label = testingInput.readInt();
            extractedTestingInput = extractFeatures(new Picture(filename));
            int predictedValue = perceptron.predictMulti(extractedTestingInput);
            countTotal++;
            if (predictedValue != label) {
                countWrong++;
                StdOut.println(filename);
            }
        }
        StdOut.println("test error rate = " + ((double) countWrong) / countTotal);
    }
}
