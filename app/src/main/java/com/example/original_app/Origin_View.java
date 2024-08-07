import java.util.ArrayList;
import java.util.Scanner;

public class MemoApp {
    private static ArrayList<String> memos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("メモアプリ");
            System.out.println("1. メモを追加する");
            System.out.println("2. メモを表示する");
            System.out.println("3. 終了する");
            System.out.print("選択してください: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addMemo();
                    break;
                case 2:
                    displayMemos();
                    break;
                case 3:
                    exit = true;
                    System.out.println("アプリを終了します。");
                    break;
                default:
                    System.out.println("無効な選択です。もう一度選んでください。");
            }
        }

        scanner.close();
    }

    private static void addMemo() {
        System.out.print("追加するメモの内容を入力してください: ");
        String memo = scanner.nextLine();
        memos.add(memo);
        System.out.println("メモを追加しました。");
    }

    private static void displayMemos() {
        System.out.println("------ メモ一覧 ------");
        for (int i = 0; i < memos.size(); i++) {
            System.out.println((i + 1) + ". " + memos.get(i));
        }
        System.out.println("---------------------");
    }
}