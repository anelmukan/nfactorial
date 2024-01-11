public class PlotFunctionEx {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[] x = new double[N
                + 1]; // птму что на 3 точки будет 2отрезка, а на N точек, чтобы было достаточно отрезков делаем N+1
        double[] y = new double[N + 1];
        for (int i = 0; i <= N; i++) {
            x[i] = Math.PI * i / N;
            y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);
            System.out.println(
                    "(" + x[i] + ", " + y[i] + ")");  // если это убрать, выдаст только рисунок
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-2.0, +2.0);
        for (int i = 0; i < N; i++)
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
    }
}
// рисует линии
