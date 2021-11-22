package Hash;
import java.util.LinkedList;

public class HashTable {
    class Node{
        String key;
        String value;

    //값 설정    
        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
        //get함수
        String value(){
            return value;
        }
        //set함수
        void value(String value){
            this.value = value;
        }
    }
    //data를 저장할 linkedlist 만들어줌
    LinkedList<Node>[] data;
    HashTable(int size){
        //크기를 미리 정해서 배열방을 만들어준다
        this.data = new LinkedList[size];
    }
    //Hash Algorithm에 해당하는 함수
    int getHashCode(String key){
        int hashcode = 0;
        //각 letter의 아스키값을 가져와서 
        for (char c : key.toCharArray()){
            //해시코드에 더해줌
            hashcode += c;
        }
        return hashcode;
    }
    //해시코드를 받아 배열방의 인덱스로 전환
    int convertToIndex(int hashcode){
        //배열방의 크기로 나눈 나머지가 인덱스가 됨
        return hashcode % data.length;
    }
    //index로 배열방을 찾은 이후에 배열방의 노드가 여러개 존재하는 경우에 검색키를 가지고 해당 노드를 찾아오는 함수 정의
    Node searchKey(LinkedList<Node> list, String key){
        //배열방이 null이면, null을 반환하고
        if(list ==null) return null;
        //그렇지 않다면 배열방에 있는 LinkedList를
        //돌면서 node의 키가 검색하는 키와 같은지 확인하고 같으면 반환 
        for (Node node:list){
            if (node.key.equals(key)){
                return node;
            }
        }
        //같은 데이터를 못찾았으면 null 반환
        return null;
    }
    //(본격) 데이터를 받아 저장하는 함수
    void put(String key, String value){
        int hashcode = getHashCode(key); 
        //해시코드를 받아온 후 배열방 인덱스 찾아주기
        int index = convertToIndex(hashcode);
        //인덱스로 기존 배열방의 데이터를 가져오고
        System.out.println(key + ", hashcode(" + hashcode + "), index (" + index + ")");
        LinkedList<Node> list = data[index];
        //배열방이 null이면 LinkedList를 생성한다...(?)
        if (list == null) {
            list = new LinkedList<Node>();
            //그리고 해당 리스트를 배열방에 넣어줌
            data[index] = list;
        }
        //기존에 해당 키로 데이터를 가지고 있는지 node를 가져옴
        Node node = searchKey(list, key);
        if (node == null){
            //데이터가 없으면 list에 노드객체 생성하고 추가
            list.addLast(new Node(key, value));
        }else{
            //node가 null이 아니면 해당 노드의 값을 대체해주는것으로 중복키 처리
            node.value(value);
        }
    }
    //key를 가지고 데이터를 받아오는 함수
    String get(String key){
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList <Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null? "Not found" : node.value();
    }
}
