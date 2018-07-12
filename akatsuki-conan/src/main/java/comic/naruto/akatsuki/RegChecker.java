package comic.naruto.akatsuki;

/**
 * @author 杨龙 [long.yl]
 * @since 2018/7/12
 */
public interface RegChecker extends BaseChecker {
    Boolean matchEmail();
    Boolean matchPhone();
    Boolean matchCardNum();
}
