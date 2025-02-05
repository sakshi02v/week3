package hashmapsandfunctions.customhashmap;

class CustomHashMapDemo {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Insert key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);
        map.put("Alice", 28); // Update existing key

        // Retrieve values
        System.out.println("Alice's Age: " + map.get("Alice"));  // 28
        System.out.println("Charlie's Age: " + map.get("Charlie"));  // 22

        // Remove a key
        map.remove("Bob");
        System.out.println("Bob's Age after removal: " + map.get("Bob"));  // null

        // Display the hash map
        map.printMap();
    }
}