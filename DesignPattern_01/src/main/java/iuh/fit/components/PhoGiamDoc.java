package iuh.fit.components;

public class PhoGiamDoc implements NhanVien{
    @Override
    public String getNhiemVu() {
        return "Học theo giám đc";
    }

    @Override
    public String getChucVu() {
        return "Phó giám ốc";
    }
}
