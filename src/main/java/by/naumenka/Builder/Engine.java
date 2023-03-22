package by.naumenka.Builder;

public class Engine {
        private final double volume;
        private double mileage;
        private boolean started;

        public Engine(double volume, double mileage) {
            this.volume = volume;
            this.mileage = mileage;
        }

        public void on() {
            started = true;
        }

        public void off() {
            started = false;
        }

        public boolean isStarted() {
            return started;
        }

        public void go(double mileage) {
            if (started) {
                this.mileage += mileage;
            } else {
                System.err.println("Вы должны завести двигатель");
            }
        }

        public double getVolume() {
            return volume;
        }

        public double getMileage() {
            return mileage;
        }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", mileage=" + mileage +
                ", started=" + started +
                '}';
    }
}