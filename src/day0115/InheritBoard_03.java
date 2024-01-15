package day0115;

import java.util.ArrayList;
import java.util.List;

interface Command{
    void write();
}
class Insert implements Command{
    @Override
    public void write() {
        System.out.println("insert");
    }
}
public class InheritBoard_03 {
}
