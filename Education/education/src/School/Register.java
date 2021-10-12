package School;

import java.util.List;
import java.util.stream.Collectors;

public class Register {

    private List<Nameable> names;

    public Register(List<Nameable> names) {
        this.names = names;
    }

    public List<Nameable> getNames() {
        return this.names;
    }

    public void setNames(List<Nameable> names) {
        this.names = names;
    }

    public List<String> getRegister() {
        return names.stream().map(x -> x.getName()).collect(Collectors.toList());
    }

    // public List<String> getRegisterByLevel(Level level) {
    // return names.stream().filter(s ->).collect(Collectors.toList());

    // }

}
