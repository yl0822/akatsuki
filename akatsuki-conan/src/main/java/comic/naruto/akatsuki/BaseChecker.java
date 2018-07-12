package comic.naruto.akatsuki;

/**
 * @author 杨龙 [long.yl]
 * @since 2018/7/12
 */
public interface BaseChecker {
    Boolean matchAll();
    Boolean matchOne();
    Boolean innerRange();
    Boolean ifAnyBlank();
    Boolean isValidNum();
    Boolean ifAnyInvalidNum();
}
