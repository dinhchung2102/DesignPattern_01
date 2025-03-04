package iuh.fit;

import iuh.fit.components.NhanVien;

public abstract class TaskDecorator implements NhanVien {
    protected NhanVien decoratedNhanVien;

    public TaskDecorator(NhanVien decoratedNhanVien) {
        this.decoratedNhanVien = decoratedNhanVien;
    }

    @Override
    public String getNhiemVu() {
        return decoratedNhanVien.getNhiemVu();
    }

    @Override
    public String getChucVu() {
        return decoratedNhanVien.getChucVu();
    }
}
