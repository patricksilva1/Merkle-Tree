## `Merkle tree`

In cryptography and computer science, a hash tree or Merkle tree is a tree in which every "leaf" (node) is labelled with the cryptographic hash of a data block, and every node that is not a leaf (called a branch, inner node, or inode) is labelled with the cryptographic hash of the labels of its child nodes. A hash tree allows efficient and secure verification of the contents of a large data structure. A hash tree is a generalization of a hash list and a hash chain.

## `Uses`:

-  Hash trees can be used to verify any kind of data stored, handled and transferred in and between computers. They can help ensure that data blocks received from other peers in a peer-to-peer network are received undamaged and unaltered, and even to check that the other peers do not lie and send fake blocks.

## `Overview`:
- A hash tree is a tree of hashes in which the leaves (i.e., leaf nodes, sometimes also called "leafs") are hashes of data blocks in, for instance, a file or set of files. Nodes farther up in the tree are the hashes of their respective children. For example, in the above picture hash 0 is the result of hashing the concatenation of hash 0-0 and hash 0-1. That is, hash 0 = hash( hash 0-0 + hash 0-1 ) where "+" denotes concatenation.

## Set up
> JDK 19

