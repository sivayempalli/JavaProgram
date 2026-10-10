package LeetCode_150.Graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Minimum_Genetic_Mutation {
    class Solution {
        public int minMutation(String startGene, String endGene, String[] bank) {


            Queue<MutationPair> queue = new LinkedList<>();
            HashSet<String> visited = new HashSet<>();
            char[] gene = {'A', 'C', 'G', 'T'};

            //["AA C/ CGGT A/","AA C/ CGCT A/","AA A/ CGGT A/"]   startGene = "AA C/A CGGT T/A", endGene = "AAACGGTA"

            // src is start index
            //compare with target , replace one char and check in bank exist ot not . if exists push and increament count

            queue.add(new MutationPair(startGene, 0));
            while (!queue.isEmpty()){

                MutationPair mp = queue.poll();

                if(visited.contains(mp.gene)){
                    continue;
                }

                visited.add(mp.gene);

                if(mp.gene.equals(endGene)){
                    return  mp.count;
                }

                for(int i=0; i<mp.gene.length(); i++){

                   // if(mp.gene.charAt(i) != endGene.charAt(i)){
                        for(char ch : gene) {

                            if(ch == mp.gene.charAt(i)){
                                continue;
                            }

                            char[] temp = mp.gene.toCharArray();
                            temp[i] = ch;
                            String nextGene = new String(temp);
                            for (int k = 0; k < bank.length; k++) {
                                System.out.println(nextGene + "   " + bank[k]);
                                if (nextGene.equals(bank[k]) && !visited.contains(nextGene)) {
                                    queue.add(new MutationPair(nextGene, mp.count + 1));
                                }
                            }
                        }
                    //}

                }

            }

            return -1;
        }

        class MutationPair{
            String gene;
            int count;

            MutationPair(String gene , int count){
                this.gene = gene;
                this.count = count;
            }
        }
    }
}
