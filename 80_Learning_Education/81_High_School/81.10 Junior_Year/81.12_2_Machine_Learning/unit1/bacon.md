---
tags:
  - MachineLearning
  - CS
  - AI
  - homework
---
# lab.py
had some fun with the last one.
```python
import json

def make_actor_dictionary(data):
    actors = {}
    for actor_pair in data:
        actor_0 = actor_pair[0]
        actor_1 = actor_pair[1]
        if actor_0 not in actors:
            actors[actor_0] = []
        if actor_1 not in actors:
            actors[actor_1] = []
        actors[actor_0].append(actor_1)
        actors[actor_1].append(actor_0)
    return actors

def did_x_and_y_act_together(data, actor_id_1, actor_id_2):
    actor_dict = make_actor_dictionary(data)
    return (actor_id_1 in actor_dict[actor_id_2])

def get_actors_with_bacon_number(data, n):
    actor_dict = make_actor_dictionary(data)
    visited = set()
    q = [(4724, 0)]
    result = set()
    while q:
        current_actor, number = q.pop(0)
        if current_actor not in visited:
            visited.add(current_actor)

            if number == n:
                result.add(current_actor)
                continue
            for actor in actor_dict[current_actor]:
                q.append((actor, number + 1))
    
    return result



def get_bacon_path(data, actor_id):
    return get_path(data, 4724, actor_id)
    
    

def get_path(data, actor_id_1, actor_id_2):
    #get path from actor 1 to actor 2
    actor_dict = make_actor_dictionary(data)
    visited = set()
    q = [(actor_id_1, [])]
    result = []
    while q:
        current_actor, path = q.pop(0)
        if current_actor not in visited:
            visited.add(current_actor)
            if current_actor == actor_id_2:
                result = path + [current_actor]
                break
            for actor in actor_dict[current_actor]:
                q.append((actor, path + [current_actor]))
    
    if result == []:
        return None
    return result

def actor_path(data, path):
    #replace all actor ids with actor names
    result = []
    for actor in path:
        result.append(data[str(actor)])
    return result

def make_movie_dictionary(data):
    movie_dict = {}
    for actor_pair in data:
        actor_0 = actor_pair[0]
        actor_1 = actor_pair[1]
        movie_id = actor_pair[2]
        if (actor_0, actor_1) not in movie_dict:
            movie_dict[(actor_0, actor_1)] = [movie_id]
        else:
            movie_dict[(actor_0, actor_1)].append(movie_id)
    
    return movie_dict
    

def get_movie_path(data, id_to_movie, actor_id_1, actor_id_2):
    actor_dict = make_movie_dictionary(data)
    
    actor_path = get_path(data, actor_id_1, actor_id_2)
    
    if actor_path == None:
        return None
    
    result = []
    
    for i in range(len(actor_path) - 1):
        actor_0 = actor_path[i]
        actor_1 = actor_path[i+1]
        movie_id = actor_dict[(actor_0, actor_1)][0]
        result.append(id_to_movie[str(movie_id)])
    
    return actor_path(id_to_movie, result) #reused this function to rename the movies

if __name__ == '__main__':
    # additional code here will be run only when lab.py is invoked directly
    # (not when imported from test.py), so this is a good place to put code
    # used, for example, to generate the results for the online questions.
    pass

```


<div style="page-break-after: always;"></div>

# test.py
made some of my own tests to confirm my findings!
```python
#!/usr/bin/env python3
import os
import lab
import json
import unittest

TEST_DIRECTORY = os.path.dirname(__file__)


class TestTiny(unittest.TestCase):
    def setUp(self):
        """ Load actor/movie database """
        filename = 'resources/tiny.json'
        #filename = 'resources/large.json'
        with open(filename, 'r') as f:
            self.data = json.load(f)


class TestActedTogether(unittest.TestCase):
    def setUp(self):
        """ Load actor/movie database """
        filename = f'resources/small.json'
        #filename = 'resources/large.json'
        with open(filename, 'r') as f:
            self.data = json.load(f)

    def test_01(self):
        # Simple test, two actors who acted together
        actor1 = 4724
        actor2 = 9210
        self.assertTrue(lab.did_x_and_y_act_together(self.data, actor1, actor2))

    def test_02(self):
        # Simple test, two actors who had not acted together
        actor1 = 4724
        actor2 = 16935
        self.assertFalse(lab.did_x_and_y_act_together(self.data, actor1, actor2))

    def test_03(self):
        # Simple test, same actor
        actor1 = 4724
        actor2 = 4724
        self.assertTrue(lab.did_x_and_y_act_together(self.data, actor1, actor2))


class TestBaconNumber(unittest.TestCase):
    def setUp(self):
        """ Load actor/movie database """
        filename = 'resources/small.json'
        with open(filename, 'r') as f:
            self.data = json.load(f)

    def test_04(self):
        # Actors with Bacon number of 2
        n = 2
        expected = {1640, 1811, 2115, 2283, 2561, 2878, 3085, 4025, 4252, 4765,
                    6541, 9827, 11317, 14104, 16927, 16935, 19225, 33668, 66785,
                    90659, 183201, 550521, 1059002, 1059003, 1059004, 1059005,
                    1059006, 1059007, 1232763}
        result = lab.get_actors_with_bacon_number(self.data, n)
        self.assertTrue(isinstance(result, set))
        self.assertEqual(result, expected)

    def test_05(self):
        # Actors with Bacon number of 3
        n = 3
        expected = {52, 1004, 1248, 2231, 2884, 4887, 8979, 10500, 12521,
                    14792, 14886, 15412, 16937, 17488, 19119, 19207, 19363,
                    20853, 25972, 27440, 37252, 37612, 38351, 44712, 46866,
                    46867, 48576, 60062, 75429, 83390, 85096, 93138, 94976,
                    109625, 113777, 122599, 126471, 136921, 141458, 141459,
                    141460, 141461, 141495, 146634, 168638, 314092, 349956,
                    558335, 572598, 572599, 572600, 572601, 572602, 572603,
                    583590, 931399, 933600, 1086299, 1086300, 1168416, 1184797,
                    1190297, 1190298, 1190299, 1190300}
        result = lab.get_actors_with_bacon_number(self.data, n)
        self.assertTrue(isinstance(result, set))
        self.assertEqual(result, expected)


class TestActorPath(unittest.TestCase):
    def setUp(self):
        """ Load actor/movie database """
        with open('resources/small.json', 'r') as f:
            self.db_small = json.load(f)
        with open('resources/large.json', 'r') as f:
            self.db_large = json.load(f)

    def test_06(self):
        # Actor path, large database, length of 7 (8 actors, 7 movies)
        actor_1 = 1345462
        actor_2 = 89614
        len_expected = 7
        result = lab.get_path(self.db_large, actor_1, actor_2)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], actor_1)
        self.assertEqual(result[-1], actor_2)

    def test_07(self):
        # Actor path, large database, length of 4 (5 actors, 4 movies)
        actor_1 = 100414
        actor_2 = 57082
        len_expected = 4
        result = lab.get_path(self.db_large, actor_1, actor_2)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], actor_1)
        self.assertEqual(result[-1], actor_2)

    def test_08(self):
        # Bacon path, large database, length of 7 (8 actors, 7 movies)
        actor_1 = 43011
        actor_2 = 1379833
        len_expected = 7
        result = lab.get_path(self.db_large, actor_1, actor_2)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], actor_1)
        self.assertEqual(result[-1], actor_2)

    def test_09(self):
        # Bacon path, large database, does not exist
        actor_1 = 43011
        actor_2 = 1204555
        expected = None
        result = lab.get_path(self.db_large, actor_1, actor_2)
        self.assertEqual(result, expected)


class TestBaconPath(unittest.TestCase):
    """ These tests check the actual path for validity, and to do so in a
    reasonable time requires a fast checking database. So this reveals
    both validate path and convert. It's probably better to put some
    subset of these into a web check only. Maybe to have a couple of
    tests here with a single unique path.
    """
    def setUp(self):
        """ Load actor/movie database """
        with open('resources/small.json', 'r') as f:
            self.db_small = json.load(f)
        with open('resources/large.json', 'r') as f:
            self.db_large = json.load(f)

    def test_10(self):
        # Bacon path, small database, path does not exist
        actor_id = 2876669
        expected = None
        result = lab.get_bacon_path(self.db_small, actor_id)
        self.assertEqual(result, expected)

    def test_11(self):
        # Bacon path, small database, length of 3 (4 actors, 3 movies)
        actor_id = 46866
        len_expected = 3
        result = lab.get_bacon_path(self.db_small, actor_id)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_small, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], 4724)
        self.assertEqual(result[-1], actor_id)

    def test_12(self):
        # Bacon path, large database, length of 2 (3 actors, 2 movies)
        actor_id = 1204
        len_expected = 2
        result = lab.get_bacon_path(self.db_large, actor_id)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], 4724)
        self.assertEqual(result[-1], actor_id)

    def test_13(self):
        # Bacon path, large database, length of 4 (5 actors, 4 movies)
        actor_id = 197897
        len_expected = 4
        result = lab.get_bacon_path(self.db_large, actor_id)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], 4724)
        self.assertEqual(result[-1], actor_id)

    def test_14(self):
        # Bacon path, large database, length of 6 (7 actors, 6 movies)
        actor_id = 1345462
        len_expected = 6
        result = lab.get_bacon_path(self.db_large, actor_id)
        # here, we compute the result twice, to test for mutation of the db
        result = lab.get_bacon_path(self.db_large, actor_id)
        len_result = -1 if result is None else len(result)-1
        self.assertTrue(valid_path(self.db_large, result))
        self.assertEqual(len_result, len_expected)
        self.assertEqual(result[0], 4724)
        self.assertEqual(result[-1], actor_id)

    def test_15(self):
        # Bacon path, large database, does not exist
        actor_id = 1204555
        expected = None
        result = lab.get_bacon_path(self.db_large, actor_id)
        self.assertEqual(result, expected)

class TestActorPath(unittest.TestCase):
    def setUp(self):
        with open('resources/nameToID.json', 'r') as f:
            self.name_to_id = json.load(f)
    
    def test_16(self):
        # Actor path, small database, length of 3 (4 actors, 3 movies)
        input = [4724, 4724, 4724, 4724]
        expected = ['Kevin Bacon', 'Kevin Bacon', 'Kevin Bacon', 'Kevin Bacon']
        result = lab.actor_path(self.name_to_id, input)
        self.assertEqual(result, expected)
    
    def test_17(self):
        # Actor path, small database, length of 3 (4 actors, 3 movies)
        input = [4724, 46866, 46867, 46866]
        expected = ['Kevin Bacon', 'Ewa Froling', 'Jan Malmsjo', 'Ewa Froling']
        result = lab.actor_path(self.name_to_id, input)
        self.assertEqual(result, expected)

class TestMoviePath(unittest.TestCase):
    


def valid_path(d, p):
    x = {frozenset(i[:-1]) for i in d}
    return all(frozenset(i) in x for i in zip(p, p[1:]))

if __name__ == '__main__':
    res = unittest.main(verbosity=2, exit=False)

```