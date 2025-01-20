package JavaConcepts;

public class TotalCostCalculator {
    public static void main(String[] args){
        String sentence1="Red pen costs Rs 200";
        String sentence2="Yellow pen costs Rs 100";
        String sentence3="Blue pen costs Rs 280";
        String sentence4="Green pen costs Rs 150";

        String[] cost1=sentence1.split("Rs ");
        String[] cost2=sentence2.split("Rs ");
        String[] cost3=sentence3.split("Rs ");
        String[] cost4=sentence4.split("Rs ");

        int c1=Integer.parseInt(sentence1.split("Rs ")[1]);
        int c2=Integer.parseInt(sentence2.split("Rs ")[1]);
        int c3=Integer.parseInt(sentence3.split("Rs ")[1]);
        int c4=Integer.parseInt(sentence4.split("Rs ")[1]);

        int t = c1 + c2 + c3 + c4;

        String[] totalSpent={cost1[1],cost2[1],cost3[1],cost4[1]};
        int totalCostSpent = 0;
        for (String spent: totalSpent){
            totalCostSpent = totalCostSpent + Integer.parseInt(spent);
        }
        System.out.println(totalCostSpent);

    }
}
