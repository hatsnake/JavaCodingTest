package HashTableTest;

public class HashTableTest1 {
    public Slot[] hashTable;

    public HashTableTest1(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;
        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTableTest1 ht = new HashTableTest1(20);
        ht.saveData("DaveLee", "01022223333");
        ht.saveData("fun-coding", "01033334444");

        String getResult = ht.getData("DaveLee");
        System.out.println(getResult);
    }
}
