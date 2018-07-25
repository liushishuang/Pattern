package behavioralType.iterator;

/**
 * @Author: Liushishuang
 * @Description:
 * @Date: 9:29 2018-7-25
 */
public class NameRepository implements Container {

    public String[] names ;

    public NameRepository(String[] names) {
        this.names = names;
    }


    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        // 初始值为0
        int index;

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
