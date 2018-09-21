import java.util.*;


/*Sorting Dates - Visa Coding Test*/
public class SortDates {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println();
        List<String> dates = new ArrayList<>();
        while (count >= 0) {
            String s = scanner.nextLine();
            dates.add(s);
            count--;
        }
        for(String s : dates){
            System.out.println(s);
        }

        List<String> sortedDates = sortDates(dates);
        for(String s : sortedDates){
            System.out.println(s);
        }

    }

    public static List<String> sortDates(List<String> dates) {

        Map<String, Integer> numberToMonth = new HashMap<>();
        numberToMonth.put("Jan",0);
        numberToMonth.put("Feb",1);
        numberToMonth.put("Mar",2);
        numberToMonth.put("Apr",3);
        numberToMonth.put("May",4);
        numberToMonth.put("Jun",5);
        numberToMonth.put("Jul",6);
        numberToMonth.put("Aug",7);
        numberToMonth.put("Sep",8);
        numberToMonth.put("Oct",9);
        numberToMonth.put("Nov",10);
        numberToMonth.put("Dec",11);
        String temp, year, month, date;
        int yy;
        List<String> result = new ArrayList<>();
        List<Date> inputList = new ArrayList<>();
        for (int i = 0; i < dates.size(); i++) {
            temp = dates.get(i);
            yy = Integer.valueOf(temp.substring(temp.length()-4)) - 1900;
            date = temp.substring(0,2);
            month = temp.substring(3,6);
            inputList.add(new Date(yy,numberToMonth.get(month),Integer.valueOf(date)));
        }

        inputList.sort(Comparator.naturalOrder());

        for (int i = 0; i < inputList.size(); i++) {
            temp = inputList.get(i).toString();
            year = temp.substring(temp.length() - 4);
            date = temp.substring(8, 10);
            month = temp.substring(4, 7);
            result.add(date + " " + month + " " + year);
        }
        return result;

    }
}
