package iuh.fit;

import iuh.fit.ConcreteDecorator.NhiemVuGiamDoc;
import iuh.fit.ConcreteDecorator.NhiemVuKeToan;
import iuh.fit.ConcreteDecorator.NhiemVuNhanVien;
import iuh.fit.ConcreteDecorator.NhiemVuPGD;
import iuh.fit.components.NVien;
import iuh.fit.components.NhanVien;
import iuh.fit.components.PhoGiamDoc;
import iuh.fit.congViec.GiamDoc;
import iuh.fit.congViec.KeToan;
import iuh.fit.context.PrintCongViec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        PrintCongViec printCongViec = new PrintCongViec();
//
//        //Mac dinh la Nhan Vien
//        printCongViec.handleRequest();
//
//        //Set state thanh giam doc:
//        printCongViec.setCurrentState(new GiamDoc());
//        printCongViec.handleRequest();
//
//        //Set thành kế toán
//        printCongViec.setCurrentState(new KeToan());
//        printCongViec.handleRequest();



        //Decorator
        System.out.println("Decorator");

        NhanVien nhanVien = new NVien();
        NhanVien giamDoc = new iuh.fit.components.GiamDoc();
        NhanVien phoGD = new PhoGiamDoc();
        NhanVien keToan = new iuh.fit.components.KeToan();

        nhanVien = new NhiemVuNhanVien(nhanVien);
        giamDoc = new NhiemVuGiamDoc(giamDoc);
        phoGD = new NhiemVuPGD(phoGD);
        keToan = new NhiemVuKeToan(keToan);

        System.out.println(nhanVien.getChucVu() + nhanVien.getNhiemVu());
        System.out.println(giamDoc.getChucVu() + giamDoc.getNhiemVu());
        System.out.println(phoGD.getChucVu() + phoGD.getNhiemVu());
        System.out.println(keToan.getChucVu() + keToan.getNhiemVu());

    }
}