package iuh.fit.congViec;

import iuh.fit.State;

public class KeToan implements State {
    @Override
    public void handleChucVu() {
        System.out.println("Đi kiếm tiền");
    }
}
