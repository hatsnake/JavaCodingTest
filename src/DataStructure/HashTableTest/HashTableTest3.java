package DataStructure.HashTableTest;

// Linear Probing 기법
public class HashTableTest3 {
    public Slot[] hashTable;

    public HashTableTest3(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String key;
        String value;
        Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            if(this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1;
                while(this.hashTable[currAddress] != null) {
                    if(this.hashTable[currAddress].key == key) {
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if(currAddress >= this.hashTable.length) {
                            return false;
                        }
                    }
                }
                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            if(this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            } else {
                Integer currAddress = address + 1;
                while(this.hashTable[currAddress] != null) {
                    if(this.hashTable[currAddress].key == key) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if(currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }

        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        HashTableTest3 ht = new HashTableTest3(20);
        ht.saveData("DaveLee", "01022223333");
        ht.saveData("fun-coding", "01033334444");
        ht.saveData("Dave", "01055556666");
        ht.saveData("DavePark", "01077778888");

        String getResult = ht.getData("fun-coding");
        System.out.println(getResult);
    }
}
