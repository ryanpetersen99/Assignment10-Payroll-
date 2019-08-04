package service;

public interface service <S, ID> {
    S create(S t);
    S read(ID id);
    S update(S t);
    void delete(ID id);
}
