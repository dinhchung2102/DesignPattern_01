package iuh.fit.context;

import iuh.fit.RoleStrategy;

public class NhanVienStrategy {
    private String name;
    private RoleStrategy roleStrategy;

    public NhanVienStrategy(String name, RoleStrategy roleStrategy) {
        this.name = name;
        this.roleStrategy = roleStrategy;
    }

    public void setRoleStrategy(RoleStrategy roleStrategy) {
        this.roleStrategy = roleStrategy;
    }

    public void printNhiemVu() {
        System.out.println( roleStrategy.getClass().getName() + ":" + roleStrategy.getNhiemVu());
    }
}

