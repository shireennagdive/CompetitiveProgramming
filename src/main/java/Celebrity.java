public class Celebrity {
    /* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */
        int person=0;
        public int findCelebrity(int n){
            for(int i=1;i<n;i++){
                if(knows(person,i)){
                    person = i;
                }
            }

            for(int i=0;i<n;i++){
                if(i!=person && (!knows(i,person) || knows(person,i)) ) return -1;
            }

            return person;
    }
}
