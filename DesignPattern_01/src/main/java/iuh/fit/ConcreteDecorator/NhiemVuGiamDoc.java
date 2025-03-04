package iuh.fit.ConcreteDecorator;

import iuh.fit.TaskDecorator;
import iuh.fit.components.NhanVien;

public class NhiemVuGiamDoc extends TaskDecorator {

    public NhiemVuGiamDoc(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public String getNhiemVu() {
        return super.getNhiemVu() + ", Chơi bời lêu lổng,";
    }
}
