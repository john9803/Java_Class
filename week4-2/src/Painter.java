public class Painter {
    private GlobalState globalState;

    public Painter() {

    }

    public void init(GlobalState globalState) {
        this.globalState = globalState;
    }


    private void paintStatus() {
        // public 메소드를 도와주는 utility 메소드라고 함.
        System.out.println("status=========================");
        System.out.println(this.globalState.dragon.toString()); // public 이라 direct로 접근
        System.out.println(this.globalState.player.toString()); // public 이라 direct로 접근
        System.out.println("===============================");
    }

    private void paintMenu() {
        // public 메소드를 도와주는 utility 메소드라고 함.
        System.out.println("menu===========================");
        System.out.println("1. fight");
        System.out.println("2. defense");
        System.out.println("3. exit");
        System.out.println("===============================");
        System.out.print("> ");
    }

    public void paint() {
        this.paintStatus();
        this.paintMenu();
    }



}
