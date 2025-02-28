import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        setSome(getSome());
    }

    public static void setSome(Any any) {
        if (any instanceof None) {
            System.out.println("Incorrect value!");
        }
    }

    public static Any getSome() {
        return new None();
    }


}

class General implements Serializable {
   //
}

class Any extends General {
    //
}



final class None extends Any {
    //
}
