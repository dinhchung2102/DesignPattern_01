package iuh.fit.congViec;

import iuh.fit.State;

public class NhanVien implements State {
    @Override
    public void handleChucVu() {
        System.out.println("Làm công ăn lương");
    }
}
