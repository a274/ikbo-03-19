package task1;

public class CheckINN {
    public static boolean check(Client client, int INN) {
         try {
             if (client.getINN() == INN) return true;
             else throw new WrongINNException("INN is wrong!");
         } catch (WrongINNException e) {
             System.err.println(e);
         }
        return false;
    }
}
