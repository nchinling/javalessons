/**@author Chin Ling 
 * @version 1.0
 * @since 2023
 **/
package javadocdemo;

/**@author Chin Ling 
 * Class for Library Book
 **/

public class Book {
    
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * 
     * @param s Book Name
     */

    public Book(String s){

    }

    /**
     * Issue a book to a student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{

    }

    /**
     * Check if book is available
     * @param str Book name
     * @return if book is available returns true, else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){
        return "";
    }
}
