package com.spring.jwt.repository;

import com.spring.jwt.entity.GameColorNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameColorNumberRepo extends JpaRepository<GameColorNumber, Integer> {


    @Query("SELECT g FROM GameColorNumber g WHERE g.o_ne = true AND g.winStatus = true")
    List<GameColorNumber> findByOneAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.t_wo = true AND g.winStatus = true")
    List<GameColorNumber> findByTwoAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.t_hree = true AND g.winStatus = true")
    List<GameColorNumber> findByThreeAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.f_our = true AND g.winStatus = true")
    List<GameColorNumber> findByFourAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.f_ive = true AND g.winStatus = true")
    List<GameColorNumber> findByFiveAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.s_ix = true AND g.winStatus = true")
    List<GameColorNumber> findBySixAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.s_even = true AND g.winStatus = true")
    List<GameColorNumber> findBySevenAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.e_ight = true AND g.winStatus = true")
    List<GameColorNumber> findByEightAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.n_ine = true AND g.winStatus = true")
    List<GameColorNumber> findByNineAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.t_en = true AND g.winStatus = true")
    List<GameColorNumber> findByTenAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.e_leven = true AND g.winStatus = true")
    List<GameColorNumber> findByElevenAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE g.t_welve = true AND g.winStatus = true")
    List<GameColorNumber> findByTwelveAndWinStatus();

    @Query("SELECT g FROM GameColorNumber g WHERE " +
            "(:zero IS NULL OR g.zero = :zero) AND " +
            "(:one IS NULL OR g.one = :one) AND " +
            "(:two IS NULL OR g.two = :two) AND " +
            "(:three IS NULL OR g.three = :three) AND " +
            "(:four IS NULL OR g.four = :four) AND " +
            "(:five IS NULL OR g.five = :five) AND " +
            "(:six IS NULL OR g.six = :six) AND " +
            "(:seven IS NULL OR g.seven = :seven) AND " +
            "(:eight IS NULL OR g.eight = :eight) AND " +
            "(:nine IS NULL OR g.nine = :nine) AND " +
            "(:red IS NULL OR g.red = :red) AND " +
            "(:black IS NULL OR g.black = :black) AND " +
            "(:yellow IS NULL OR g.yellow = :yellow) AND " +
            "(:winStatus IS NULL OR g.winStatus = :winStatus)")
    List<GameColorNumber> findByCriteria(
            @Param("zero") Boolean zero,
            @Param("one") Boolean one,
            @Param("two") Boolean two,
            @Param("three") Boolean three,
            @Param("four") Boolean four,
            @Param("five") Boolean five,
            @Param("six") Boolean six,
            @Param("seven") Boolean seven,
            @Param("eight") Boolean eight,
            @Param("nine") Boolean nine,
            @Param("red") Boolean red,
            @Param("black") Boolean black,
            @Param("yellow") Boolean yellow,
            @Param("winStatus") Boolean winStatus);

    @Query("SELECT gcn FROM GameColorNumber gcn WHERE gcn.userReferenceId = :userReferenceId AND gcn.winStatus = :winStatus")
    List<GameColorNumber> findByRefAndPeriodAndWinStatus(@Param("userReferenceId") String userReferenceId,
                                                         @Param("winStatus") Boolean winStatus);


    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.black = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer finByBlack(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.red = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByRed(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.yellow = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByYellow(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.zero = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByZero(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.one = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByOne(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.two = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByTwo(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.three = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByThree(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.four = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByFour(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.five = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByFive(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.six = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findBySix(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.seven = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findBySeven(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.eight = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByEight(@Param("status") Boolean status);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.nine = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByNine(@Param("status") Boolean status);

    @Query("SELECT g FROM GameColorNumber g WHERE " +
            "(:winStatus IS NULL OR g.winStatus = :winStatus)")
    List<GameColorNumber> findAllWinStatus(Boolean winStatus);

    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.o_ne = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByO(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.t_wo = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByT(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.t_hree = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByTh(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.f_our = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByFo(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.f_ive = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByFi(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.s_ix = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findBySi(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.s_even = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findBySe(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.e_ight = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByEi(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.n_ine = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByNi(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.t_en = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByTe(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.e_leven = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByEl(@Param("status") Boolean status);
    @Query(value = "SELECT SUM(g.amount) as totalAmount FROM GameColorNumber g WHERE g.t_welve = :status AND g.winStatus = FALSE",nativeQuery = false )
    Integer findByTwEl(@Param("status") Boolean status);


}
