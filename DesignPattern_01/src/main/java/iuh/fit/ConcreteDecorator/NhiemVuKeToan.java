package iuh.fit.ConcreteDecorator;

import iuh.fit.TaskDecorator;
import iuh.fit.components.NhanVien;

public class NhiemVuKeToan extends TaskDecorator {
    public NhiemVuKeToan(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public String getNhiemVu() {
        return super.getNhiemVu() + ", Biển thủ công quỹ";
    }
}
