import java.util.ArrayList;
import java.util.List;

public class ExchangeRecord {

    private final List<ExchangeInformation> listOfExchangeCurrencies = new ArrayList<>();

    void addToList(ExchangeInformation information, double amount){

        if (information.result.equals("success")) {
            information.amount(amount);
            System.out.println(information);
            listOfExchangeCurrencies.add(information);
        }
        else System.out.println("Couldn't convert the values... Be sure you're using a correct CODE!\n");
    }
    void  watchRecordInformation(){
        if (listOfExchangeCurrencies.isEmpty()) System.out.println("The list is empty");

        else{
            int numberOfRecord = 1;
            for(ExchangeInformation information : listOfExchangeCurrencies){
                System.out.println(numberOfRecord + ") " + information);
                numberOfRecord++;
            }
        }
    }

}

