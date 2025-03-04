package iuh.fit.ConcreteDecorator;

import iuh.fit.TaskDecorator;
import iuh.fit.components.NhanVien;

public class NhiemVuNhanVien extends TaskDecorator {
    public NhiemVuNhanVien(NhanVien decoratedNhanVien) {
        super(decoratedNhanVien);
    }

    @Override
    public String getNhiemVu() {
        return super.getNhiemVu() + ",Cày cuốc trả nợ";
    }
}
