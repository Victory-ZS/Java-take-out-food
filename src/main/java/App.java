import java.util.List;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    private ItemRepository itemRepository;
    private SalesPromotionRepository salesPromotionRepository;

    public App(ItemRepository itemRepository, SalesPromotionRepository salesPromotionRepository) {
        this.itemRepository = itemRepository;
        this.salesPromotionRepository = salesPromotionRepository;
    }

    public String bestCharge(List<String> inputs) {
        //TODO: write code here

        System.out.println("============= Order details =============");

        String str = String.join("", inputs);
        int tag1 = str.indexOf("ITEM0001");
        int num1 = 0,num2 = 0,num3 = 0, num4 = 0;
        if (tag1 != -1){
            char char1 = str.charAt(tag1+11);
            num1 = Character.getNumericValue(char1);
            System.out.println("Braised chicken x "+char1+" = "+num1*18+" yuan");
        }
        int tag2 = str.indexOf("ITEM0013");
        if (tag2 != -1){
            char char2 = str.charAt(tag2+11);
            num2 = Character.getNumericValue(char2);
            System.out.println("Chinese hamburger x "+char2+" = "+num2*6+" yuan");
        }
        int tag3 = str.indexOf("ITEM0022");
        if (tag3 != -1){
            char char3 = str.charAt(tag3+11);
            num3 = Character.getNumericValue(char3);
            System.out.println("Cold noodles x "+char3+" = "+num3*8+" yuan");
        }
        int tag4 = str.indexOf("ITEM0030");
        if (tag4 != -1){
            char char4 = str.charAt(tag4+11);
            num4 = Character.getNumericValue(char4);
            System.out.println("coca-cola x "+char4+" = "+num4*2+" yuan");
        }
        System.out.println("-----------------------------------");
        int sum0 = num1*18 +num2*6 + num3*8 +num4*2, sum1 = 10000, sum2 = 10000;  // 原价
        if (sum0 >= 30) {sum1 = sum0-6;}                                         // 30-6
        if (tag1!=-1 || tag3!=-1) {sum2 = num1*9 +num2*6 + num3*4 +num4*2;}       // 部分半价

        if(sum0 < sum1 && sum0 < sum2) {
            System.out.println("Total:" + sum0 + " yuan\n" +
                    "===================================");
        }
        else if(sum1 < sum0 && sum1 <= sum2){
            System.out.println("Promotion used:\n" +
                    "Deduct 6 yuan when the order reaches 30 yuan, saving 6 yuan\n" +
                    "-----------------------------------\n" +
                    "Total:"+ sum1 +" yuan\n" +
                    "===================================");
        }
        else if (sum2 < sum0 && sum2 < sum1){
            System.out.println("Promotion used:\n" +
                    "Half price for certain dishes (Braised chicken，Cold noodles), saving "+(sum0 - sum2)+" yuan\n" +
                    "-----------------------------------\n" +
                    "Total:"+ sum2 +" yuan\n" +
                    "===================================");
        }
        
        
        
        
        return null;
    }
}
