package z2;

public class WalidatorKoduPocztowego {
    public static void walidujKodPocztowy(String code) {
        if (code.length() != 6)
            throw new BlednyKodPocztowyException("Nieprawidlowa dlugosc");

        if (code.charAt(2) == '-') {
            String onlyNumber = code.replaceAll("-", "");
            for (Character ch : onlyNumber.toCharArray()) {
                if (!Character.isDigit(ch))
                    throw new BlednyKodPocztowyException();
            }
        } else
            throw new BlednyKodPocztowyException("Brakuje myslnika");

        System.out.println("Your postal code: "+ code +" is good");
    }
}
