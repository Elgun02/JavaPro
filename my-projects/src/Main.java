import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        GeneratorPensionFundFile generatorPensionFundFile = new GeneratorPensionFundFile(); // <- При желании можете обновить список
        GeneratorWorkerFile generatorWorkerFile = new GeneratorWorkerFile();                // <- При желании можете обновить список
        GeneratePensionFund generatePensionFund = new GeneratePensionFund();
        List<PensionFund> pensionFunds = generatePensionFund.generate();
        List<Worker> workersList = pensionFunds.stream()
                .flatMap(x -> x.getMembersList().stream())
                .toList();

        Search search = new Search();
        Scanner sc = new Scanner(System.in);
        boolean console = true;
        System.out.println("\u001B[36mНапишите '/commands' для просмотра всех команд\u001B[0m");
        while (console) {
            System.out.print("\u001B[32mConsole: \u001B[0m");
            String input = sc.next();

            // switch можно было сделать так ( case "something" ->, и без break, но оставил так для красоты.
            switch (input) {
                case "/fund_size":               // <- Количество всех фондов
                    System.out.println("\u001B[33mКоличество Всех Фондов: \u001B[0m" + pensionFunds.size());
                    break;
                case "/member_size":             // <- Количество всех участников
                    System.out.println("\u001B[33mКоличество Всех Участников: \u001B[0m" + workersList.size());
                    break;
                case "/find_max_members":        // <- Найти фонд с максимальным количеством участников
                    System.out.println("\u001B[33mФонд с максимальным количеством участников: \u001B[0m");
                    search.findMaxMembers(pensionFunds).info();
                    break;
                case "/find_name":               // <- Найти имя участника с максимальной пенсии среди всех работников
                    System.out.println("\u001B[33mИмя участника с максимальной пенсии: \u001B[0m" + search.findNameMaxPension(workersList));
                    break;
                case "/find_losers":             // <- Найти количество людей которые стали жертвами не государственными фондами
                    System.out.println("\u001B[33mКоличество людей которые стали жертвами: \u001B[0m" + search.findLosers(pensionFunds).size());
                    break;
                case "/average_pension":         // <- Средняя пенсия среди всех пенсионных фондов
                    System.out.println("\u001B[33mСредняя пенсия среди фондов: \u001B[0m" + (int) search.findAveragePension(pensionFunds));
                    break;
                case "/average_pension_w": // <- Средняя пенсия среди всех работников
                    System.out.println("\u001B[33mСредняя пенсия среди работников: \u001B[0m" + (int) search.findAveragePensionWorkers(workersList));
                    break;
                case "/max_pension_25":          // <- Максимальная пенсия среди работников до 25 лет
                    System.out.println("\u001B[33mМаксимальная пенсия среди работников до 25 лет: \u001B[0m" + (int) search.findMaxPensionUpTo25(workersList));
                    break;
                case "/jr_worker":               // <- Найти самого молодого работника
                    System.out.println("\u001B[33mСамый младший работник: \u001B[0m");
                    search.jrWorker(workersList).info();
                    break;
                case "/senior_worker":           // <- Найти самого старшего работника
                    System.out.println("\u001B[33mСамый старший работник: \u001B[0m");
                    search.seniorWorker(workersList).info();
                    break;
                case "/exit":                    // <- Завершить программу
                    System.out.println("\u001B[35mПрограмма закрыта.\u001B[0m");
                    console = false;
                    break;
                case "/clear":                   // <- Очистить консоль
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                    System.out.println("\u001B[35mConsole cleared.\u001B[0m");
                    break;
                case "/commands":
                    System.out.println(
                            """
                                    \u001B[37m/fund_size\u001B[0m
                                    \u001B[37m/member_size\u001B[0m
                                    \u001B[37m/find_max_members\u001B[0m
                                    \u001B[37m/find_name\u001B[0m
                                    \u001B[37m/find_losers\u001B[0m
                                    \u001B[37m/average_pension\u001B[0m
                                    \u001B[37m/average_pension_w\u001B[0m
                                    \u001B[37m/max_pension_25\u001B[0m
                                    \u001B[37m/jr_worker\u001B[0m
                                    \u001B[37m/senior_worker\u001B[0m
                                    \u001B[37m/clear\u001B[0m
                                    \u001B[37m/exit\u001B[0m
                                            """
                    );
                    break;
                default:
                    System.out.println("\u001B[31mcommand not found\u001B[0m");
            }
        }
    }
}