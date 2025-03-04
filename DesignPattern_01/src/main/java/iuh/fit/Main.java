package iuh.fit;

import iuh.fit.congViec.GiamDoc;
import iuh.fit.congViec.KeToan;
import iuh.fit.context.PrintCongViec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintCongViec printCongViec = new PrintCongViec();

        //Mac dinh la Nhan Vien
        printCongViec.handleRequest();

        //Set state thanh giam doc:
        printCongViec.setCurrentState(new GiamDoc());
        printCongViec.handleRequest();

        //Set thành kế toán
        printCongViec.setCurrentState(new KeToan());
        printCongViec.handleRequest();
    }
}