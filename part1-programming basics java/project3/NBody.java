public class NBody {
    // solution
    public static void main(String[] args) {

        // Step 1. Parse command line arguments.
        double stoppingTime = Double.parseDouble(args[0]); // simulation duration
        double dt = Double.parseDouble(args[1]); // time increment
        // ##################################################################

        // Step 2. Read universe from standard input.
        int n = StdIn.readInt(); // number of planets
        double radius = StdIn.readDouble(); // universe radius

        // arrays to store planets' information
        double[] px = new double[n];
        double[] py = new double[n];
        double[] vx = new double[n];
        double[] vy = new double[n];
        double[] mass = new double[n];
        String[] image = new String[n];

        // read each planet's data into array
        for (int i = 0; i < n; i++) {
            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString();
        }
        // ##################################################################

        // Step 3. Initialize standard drawing
        StdDraw.setXscale(-radius, radius);
        StdDraw.setYscale(-radius, radius);
        StdDraw.enableDoubleBuffering();
        // ##################################################################

        // Step 4. Play music on standard audio
        StdAudio.playInBackground("2001.wav");
        // ##################################################################

        // Step 5. Simulate the universe.
        // arrays to store net forces
        double[] fx = new double[n];
        double[] fy = new double[n];

        for (double currentTime = 0.0; currentTime < stoppingTime; currentTime += dt) {
            // Initialize net forces to zero for each particle at the beginning of each time step
            for (int i = 0; i < n; i++) {
                fx[i] = 0;
                fy[i] = 0;
            }

            // Step 5A. Calculate net forces.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        double dx = px[j] - px[i];
                        double dy = py[j] - py[i];
                        double r = Math.sqrt(dx * dx + dy * dy);
                        double G = 6.67e-11;
                        double force = G * (mass[i] * mass[j]) / (r * r);
                        fx[i] += force * dx / r;
                        fy[i] += force * dy / r;
                    }
                }
            }

            // Step 5B. Update velocities and positions.
            for (int i = 0; i < n; i++) {
                double ax = fx[i] / mass[i];
                double ay = fy[i] / mass[i];
                // Update velocity based on acceleration
                vx[i] = vx[i] + ax * dt;
                vy[i] = vy[i] + ay * dt;

                // Update position
                px[i] = px[i] + vx[i] * dt;
                py[i] = py[i] + vy[i] * dt;
            }

            // Step 5C. Draw universe to standard drawing.
            // Clear drawing canvas
            StdDraw.clear();
            // Draw background image centered at center (0, 0)
            StdDraw.picture(0, 0, "starfield.jpg");
            // Draw planets
            for (int i = 0; i < n; i++) {
                StdDraw.picture(px[i], py[i], image[i]);
            }
            // Show the updated frame
            StdDraw.show();
            // Control animation speed
            StdDraw.pause(20);
        }
        // ##################################################################

        // Step 6. Print universe to standard output.
        StdOut.printf("%d\n", n);
        StdOut.printf("%.2e\n", radius);
        for (int i = 0; i < n; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          px[i], py[i], vx[i], vy[i], mass[i], image[i]);
        }
        // ##################################################################
    }

}


