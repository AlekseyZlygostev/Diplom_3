package testscenarios;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pagelocators.HomePage;
import setupclasses.BeforeAfterSteps;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ConstructorSectionsTest extends BeforeAfterSteps {
    private final String bookmarkName;
    private final String imagePath;
    private final String ingredientName;

    public ConstructorSectionsTest(String bookmarkName, String imagePath, String ingredientName) {
        this.bookmarkName = bookmarkName;
        this.imagePath = imagePath;
        this.ingredientName = ingredientName;
    }

    @Parameterized.Parameters
    public static Object[][] getAnswer() {
        return new Object[][] {
                {"Начинки", "https://code.s3.yandex.net/react/code/meat-04.png", "Говяжий метеорит (отбивная)"},
                {"Соусы", "https://code.s3.yandex.net/react/code/sauce-01.png", "Соус с шипами Антарианского плоскоходца"},
                {"Булки", "https://code.s3.yandex.net/react/code/bun-02.png", "Краторная булка N-200i"},
        };
    }

    @Test
    public void switchSectionTest() {

        HomePage objHomePage = new HomePage(driver);
        String actualIngredientName = objHomePage.checkSectionChange(bookmarkName, imagePath);
        assertEquals(ingredientName, actualIngredientName);
    }
}
