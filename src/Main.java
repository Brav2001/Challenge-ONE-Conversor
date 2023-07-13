import com.one.challenge.conversor.utilities.Conversor;

/**
 * @author Brayan_Acosta_Vivas
 */
public class Main {

    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        try{
            conversor.main(args);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}