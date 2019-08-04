//Ryan Petersen

package repository;

public interface repository<R, ID> {
    R create(R t);
    R read(ID id);
    R update(R t);
    void delete(ID id);
}