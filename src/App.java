import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> transactions = new ArrayList<>();

        // List of Blockchain Transactions Hashes that will become one Hash, the Merkle
        // Root.
        transactions.add("15bf532d22345576b4a51b96da4754c039ef3458494066d76828e893d69ebd1e");
        transactions.add("f91a799a01ebac97c8995f50381b5be0d43ca7eb0c6a6c6bc07603c5a922d1fa");
        transactions.add("ee80b6f59a0e2c1c30853d1be6246defa9e70c10f8efb2178cabe14f2edca6ba");
        transactions.add("09c45dae0b27fc48e3354639df145d59e5ba32a5e32fcedc59bf77e9cfa8f99e");
        transactions.add("dbca0e8e1b32e18e322ca9bd27efc3f1266475a20d1e09ff59daef700fa0097b");

        transactions.add("cae2b7a8392118a6c4d55c3cf865ba346ccb4d33ca7bde8a2185390e28179448");
        transactions.add("9d53feb0cdf22b11ea1cd5718321897803d6dc07d017fac25b78c2f0a1901ea6");
        transactions.add("9b11c5288d98c663d10087aa4ef3f92d35c573b8cd32e41cc652622883e258f7");
        transactions.add("35cc3907644d35a6eaf275bb586c6035eeee2674e3353228cac8c2d79d711933");
        transactions.add("ea18368d8d9c2d1506e44a6ae510188674cbdd2ba9c9868c3b0ab47cc4d5c588");

        transactions.add("2b5a283fdbb98e8b98b11d4debb4ccd83ce4bc1949e8a4b8ff7304443d0d1401");
        transactions.add("a8915b446445d8981cc8a0f80a022ab49efe09dfd0f28dabd1bbfac166a8cdb4");
        transactions.add("ffdf38ff839b64e1e1f17c09edbb80d3cc39744adcbb6d6953260cd13b0f2b52");
        transactions.add("e7dc5e7186862a366a6fdfcc5f796c6b840c4cebdcb2906628266984fcd6dac1");
        transactions.add("5f12cffe160626b1a73cac21d94b3e79bbff323238c5c858c0bdb83d654d3d15");

        transactions.add("dfa774813451c274183ca8347cac7306c20d1e3217936d8dc6136afc2569cadc");
        transactions.add("da4338522f3233794e6084a3160572997aa2083dfddd899a8931091da6b98b01");
        transactions.add("69bbe282c6f1af52a7bd4881ba57b4127aae02d6924041d4b75b8d5943348ceb");
        transactions.add("54e852c4775344a6f33d1683f03bf245cd11439564eb632364d59ad8880ce161");
        transactions.add("6e35aa8e013a2c106099f07e621ea50168ab5d0d505a433521b503f1bb39674b");

        transactions.add("3cf41b61e81bd29fdc0ea7f47ac9fe7cc265de29ff2346efdab09c1bdae6d680");
        transactions.add("d3b5c2b5c4712e9d976a2861c92b88f4ccdd83862450de6d592e843f25d7a91e");
        transactions.add("12e2186e19ecf879a2be82fb563083beaf3dacfe87ca7ad548ea86b402f53c34");
        transactions.add("6848383112b351f262c1704ba024ff7897eaf7da40846767eaae52539f185dc9");
        transactions.add("c9f05a5b2144ec6eca15abf6f609680cd7a01b90fc7f9b3f8a94204d4225396e");

        transactions.add("0a4ddd1ee3f1407eb19b5385c3d456bfce9569b3c706ae86f9d776833efed961");

        MerkleTree merkleTree = new MerkleTree(transactions);

        System.out.println("Merkle Root: " + merkleTree.getMerkleRoot().get(0));
    }
}
