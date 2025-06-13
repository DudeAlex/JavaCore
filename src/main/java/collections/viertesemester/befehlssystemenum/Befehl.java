package collections.viertesemester.befehlssystemenum;

public enum Befehl {

    START {
        @Override
        public void ausfuehren(){
            System.out.println("Start");
        }
    },

    STOP {
        @Override
        public void ausfuehren(){
            System.out.println("Stop");
        }
    },

    PAUSE{
        @Override
        public void ausfuehren(){
            System.out.println("Pause");
        }
    },

    RESET{
        @Override
        public void ausfuehren(){
            System.out.println("Reset");
        }
    };

    public abstract void ausfuehren();

}
