class MyHashSet {
private:
    vector<int> hashset;
public:
    MyHashSet() {
        hashset = {};
    }
    
    void add(int key) {
        if(!contains(key)){
            hashset.push_back(key);
        }
    }
    
    void remove(int key) {
        if(contains(key)){
            hashset.erase(std::remove(hashset.begin(), hashset.end(), key), hashset.end());
        }
    }
    
    bool contains(int key) {
        auto it = find(hashset.begin(), hashset.end(), key);
        if(it == hashset.end()){
            return false;
        }
        return true;
    }

};

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet* obj = new MyHashSet();
 * obj->add(key);
 * obj->remove(key);
 * bool param_3 = obj->contains(key);
 */