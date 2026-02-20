#include <iostream>
using namespace std;
#include <set>
#include <vector>
class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
// C time
        std::set<int> bell;
        for(int num : nums){
            auto it = bell.find(num);
            if(it != bell.end()){
                return true;
            }
            bell.insert(num);
        }
        return false;
    }
};