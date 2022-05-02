public class Won {
    public static void main(String[] args) {
        KRW k = new KRW(1500.00, "원");
        USB u = new USB(100.0, "달라");
        EUR e = new EUR(260.87, "유로");
        JPY j = new JPY(6400.0, "엔");

        FUll[] f = {k, u, e, j};

        for (FUll a : f) {
            System.out.println(a.toString());
        }
    }
}
    class FUll {
        private double won;
        private String not;

        public FUll(double won, String not) {
            this.won = won;
            this.not = not;
        }

        @Override
        public String toString() {
            return "" +won+" "+ not;


        }
    }


    class KRW extends FUll {
        public KRW(double won, String not) {
            super(won, not);
        }
    }

    class USB extends FUll {
        public USB(double won, String not) {
            super(won, not);
        }
    }

    class EUR extends FUll {
        public EUR(double won, String not) {
            super(won, not);
        }
    }

    class JPY extends FUll {
        public JPY(double won, String not) {
            super(won, not);
        }
    }
