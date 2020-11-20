//package pl.coderslab.app;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Data
//public class DBaseBooks{
//    public List<Book> books;
//    private static Long nextId = 6L;
//    public DBaseBooks() {
//
//        books = new ArrayList<>();
//
//        books.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
//        books.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
//                "programming"));
//        books.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
//                "programming"));
//        books.add(new Book(4L, "3901283092103", "Biblia", "VA", "ZNAK", "fantasy"));
//        books.add(new Book(5L, "9140298320983", "Cień Wiatru", "Juan Carlos Zafon", "Czarne", "obyczajowe"));
//
//    }}
////
////    @Override
////        public void add(Book book) {
////            book.setId(nextId++);
////            books.add(book);
////        }
////    }
////
////    @Override
////    public Optional<Book> get(Long id) {
////        return books.stream().filter(item -> item.getId().equals(id)).findFirst();
////    }
////
////    @Override
////    public void delete(Long id) {
////        if (get(id).isPresent()) {
////            books.remove(this.get(id).get());
////        }
////
////    }
////
////}
