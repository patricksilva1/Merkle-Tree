import java.util.ArrayList;
import java.util.List;

public class MerkleTree {

    // We Store the transactions in this List here
    private List<String> transactions;

    public MerkleTree(List<String> transactions) {
        this.transactions = transactions;
    }

    // The root is in this list in the end
    public List<String> getMerkleRoot() {
        return construct(this.transactions);
    }

    // It is a recursive funcion that keeps merging the neighboring hashes, e.g.:
    // (index i and i + 1)
    private List<String> construct(List<String> transactions) {

        // Base case for recursive method calls
        if (transactions.size() == 1) {
            return transactions;
        }

        // Merging the neighboring items
        List<String> updatedList = new ArrayList<>();

        // Merging the neighboring items
        for (int i = 0; i < transactions.size() - 1; i += 2) {
            updatedList.add(mergeHash(transactions.get(i), transactions.get(i + 1)));
        }

        // If the number of transactions is odd: the last item is hashed with itself
        if (transactions.size() % 2 == 1) {
            updatedList.add(
                    mergeHash(transactions.get(transactions.size() - 1), transactions.get(transactions.size() - 1)));
        }

        // Recursive Method Call
        return construct(updatedList);
    }

    // Concatenate two strings and hash it with SHA256
    private String mergeHash(String hash1, String hash2) {

        String mergedHash = hash1 + hash2;

        return SHA256Helper.hash(mergedHash);
    }

}
