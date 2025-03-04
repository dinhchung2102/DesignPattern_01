package iuh.fit.congViec;

import iuh.fit.State;

public class PhoGiamDoc implements State {
    @Override
    public void handleChucVu() {
        System.out.println("Học theo giám đốc");
    }
}
