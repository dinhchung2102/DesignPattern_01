package iuh.fit.ConcreteDecorator;

import iuh.fit.TaskDecorator;
import iuh.fit.components.NhanVien;

public class NhiemVuPGD extends TaskDecorator {
    public NhiemVuPGD(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public String getNhiemVu() {
        return super.getNhiemVu() + "hối lộ giám đoc";
    }
}
