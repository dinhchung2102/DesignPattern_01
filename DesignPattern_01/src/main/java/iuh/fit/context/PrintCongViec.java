package iuh.fit.context;

import iuh.fit.State;
import iuh.fit.congViec.NhanVien;

public class PrintCongViec {

    private State currentState;

    public PrintCongViec() {
        currentState = new NhanVien();
    }


    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handleRequest(){
        currentState.handleChucVu();
    }
}
