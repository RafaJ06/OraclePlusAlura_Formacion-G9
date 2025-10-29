public class ExchangeInformation {

    String result;
    String base_code;
    String target_code;
    double conversion_rate;
    double conversion_result;
    double amount;

    public void amount(double amount){
        this.amount = amount;
    }

    public String toString(){

        return """
                    The exchange currency for 1 %s to %s is: %.4f
                    The total exchange for %.4f is: %.4f
                    """.formatted(base_code, target_code,
                conversion_rate, amount, conversion_result);
    }
}
