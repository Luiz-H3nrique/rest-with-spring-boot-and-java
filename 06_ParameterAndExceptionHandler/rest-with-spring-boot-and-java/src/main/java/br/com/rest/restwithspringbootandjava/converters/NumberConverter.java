package br.com.rest.restwithspringbootandjava.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws Exception {
        if(strNumber == null){
            throw new Exception("Não é aceito nulo");
        }else {
            String number = strNumber.replace(",",".");
            if(isNumeric(number)){
                return Double.parseDouble(number);
            }
            return 0D;
        }
    }

    public  static  boolean isNumeric(String strNumber) {

        if(strNumber == null){
            return false;
        }else {
            String number = strNumber.replaceAll(",",".");
            return number.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
    }

}
