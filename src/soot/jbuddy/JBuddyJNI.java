package soot.jbuddy;

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.17u-20021128-1508
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


class JBuddyJNI {
  public final static native int get_bddop_and();
  public final static native int get_bddop_xor();
  public final static native int get_bddop_or();
  public final static native int get_bddop_nand();
  public final static native int get_bddop_nor();
  public final static native int get_bddop_imp();
  public final static native int get_bddop_biimp();
  public final static native int get_bddop_diff();
  public final static native int get_bddop_less();
  public final static native int get_bddop_invimp();
  public final static native int get_bddop_not();
  public final static native int get_bddop_simplify();
  public final static native void set_bddPair_result(long jarg1, long jarg2);
  public final static native long get_bddPair_result(long jarg1);
  public final static native void set_bddPair_last(long jarg1, int jarg2);
  public final static native int get_bddPair_last(long jarg1);
  public final static native void set_bddPair_id(long jarg1, int jarg2);
  public final static native int get_bddPair_id(long jarg1);
  public final static native void set_bddPair_next(long jarg1, long jarg2);
  public final static native long get_bddPair_next(long jarg1);
  public final static native long new_bddPair();
  public final static native void delete_bddPair(long jarg1);
  public final static native void set_bddStat_produced(long jarg1, int jarg2);
  public final static native int get_bddStat_produced(long jarg1);
  public final static native void set_bddStat_nodenum(long jarg1, int jarg2);
  public final static native int get_bddStat_nodenum(long jarg1);
  public final static native void set_bddStat_maxnodenum(long jarg1, int jarg2);
  public final static native int get_bddStat_maxnodenum(long jarg1);
  public final static native void set_bddStat_freenodes(long jarg1, int jarg2);
  public final static native int get_bddStat_freenodes(long jarg1);
  public final static native void set_bddStat_minfreenodes(long jarg1, int jarg2);
  public final static native int get_bddStat_minfreenodes(long jarg1);
  public final static native void set_bddStat_varnum(long jarg1, int jarg2);
  public final static native int get_bddStat_varnum(long jarg1);
  public final static native void set_bddStat_cachesize(long jarg1, int jarg2);
  public final static native int get_bddStat_cachesize(long jarg1);
  public final static native void set_bddStat_gbcnum(long jarg1, int jarg2);
  public final static native int get_bddStat_gbcnum(long jarg1);
  public final static native long new_bddStat();
  public final static native void delete_bddStat(long jarg1);
  public final static native void set_bddGbcStat_nodes(long jarg1, int jarg2);
  public final static native int get_bddGbcStat_nodes(long jarg1);
  public final static native void set_bddGbcStat_freenodes(long jarg1, int jarg2);
  public final static native int get_bddGbcStat_freenodes(long jarg1);
  public final static native void set_bddGbcStat_time(long jarg1, int jarg2);
  public final static native int get_bddGbcStat_time(long jarg1);
  public final static native void set_bddGbcStat_sumtime(long jarg1, int jarg2);
  public final static native int get_bddGbcStat_sumtime(long jarg1);
  public final static native void set_bddGbcStat_num(long jarg1, int jarg2);
  public final static native int get_bddGbcStat_num(long jarg1);
  public final static native long new_bddGbcStat();
  public final static native void delete_bddGbcStat(long jarg1);
  public final static native void set_bddCacheStat_uniqueAccess(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_uniqueAccess(long jarg1);
  public final static native void set_bddCacheStat_uniqueChain(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_uniqueChain(long jarg1);
  public final static native void set_bddCacheStat_uniqueHit(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_uniqueHit(long jarg1);
  public final static native void set_bddCacheStat_uniqueMiss(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_uniqueMiss(long jarg1);
  public final static native void set_bddCacheStat_opHit(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_opHit(long jarg1);
  public final static native void set_bddCacheStat_opMiss(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_opMiss(long jarg1);
  public final static native void set_bddCacheStat_swapCount(long jarg1, long jarg2);
  public final static native long get_bddCacheStat_swapCount(long jarg1);
  public final static native long new_bddCacheStat();
  public final static native void delete_bddCacheStat(long jarg1);
  public final static native long bdd_error_hook(long jarg1);
  public final static native long bdd_gbc_hook(long jarg1);
  public final static native long bdd_resize_hook(long jarg1);
  public final static native long bdd_reorder_hook(long jarg1);
  public final static native long bdd_file_hook(long jarg1);
  public final static native int bdd_init(int jarg1, int jarg2);
  public final static native void bdd_done();
  public final static native int bdd_setvarnum(int jarg1);
  public final static native int bdd_extvarnum(int jarg1);
  public final static native int bdd_isrunning();
  public final static native int bdd_setmaxnodenum(int jarg1);
  public final static native int bdd_setmaxincrease(int jarg1);
  public final static native int bdd_setminfreenodes(int jarg1);
  public final static native int bdd_getnodenum();
  public final static native int bdd_getallocnum();
  public final static native String bdd_versionstr();
  public final static native int bdd_versionnum();
  public final static native void bdd_stats(long jarg1);
  public final static native void bdd_cachestats(long jarg1);
  public final static native void bdd_fprintstat(long jarg1);
  public final static native void bdd_printstat();
  public final static native void bdd_default_gbchandler(int jarg1, long jarg2);
  public final static native void bdd_default_errhandler(int jarg1);
  public final static native String bdd_errstring(int jarg1);
  public final static native void bdd_clear_error();
  public final static native int bdd_true();
  public final static native int bdd_false();
  public final static native int bdd_varnum();
  public final static native int bdd_ithvar(int jarg1);
  public final static native int bdd_nithvar(int jarg1);
  public final static native int bdd_var(int jarg1);
  public final static native int bdd_low(int jarg1);
  public final static native int bdd_high(int jarg1);
  public final static native int bdd_addref(int jarg1);
  public final static native int bdd_delref(int jarg1);
  public final static native void bdd_gbc();
  public final static native int bdd_scanset(int jarg1, long jarg2, long jarg3);
  public final static native int bdd_makeset(long jarg1, int jarg2);
  public final static native long bdd_newpair();
  public final static native int bdd_setpair(long jarg1, int jarg2, int jarg3);
  public final static native int bdd_setpairs(long jarg1, long jarg2, long jarg3, int jarg4);
  public final static native int bdd_setbddpair(long jarg1, int jarg2, int jarg3);
  public final static native int bdd_setbddpairs(long jarg1, long jarg2, long jarg3, int jarg4);
  public final static native void bdd_resetpair(long jarg1);
  public final static native void bdd_freepair(long jarg1);
  public final static native int bdd_setcacheratio(int jarg1);
  public final static native int bdd_buildcube(int jarg1, int jarg2, long jarg3);
  public final static native int bdd_ibuildcube(int jarg1, int jarg2, long jarg3);
  public final static native int bdd_not(int jarg1);
  public final static native int bdd_apply(int jarg1, int jarg2, int jarg3);
  public final static native int bdd_and(int jarg1, int jarg2);
  public final static native int bdd_or(int jarg1, int jarg2);
  public final static native int bdd_xor(int jarg1, int jarg2);
  public final static native int bdd_imp(int jarg1, int jarg2);
  public final static native int bdd_biimp(int jarg1, int jarg2);
  public final static native int bdd_ite(int jarg1, int jarg2, int jarg3);
  public final static native int bdd_restrict(int jarg1, int jarg2);
  public final static native int bdd_constrain(int jarg1, int jarg2);
  public final static native int bdd_replace(int jarg1, long jarg2);
  public final static native int bdd_compose(int jarg1, int jarg2, int jarg3);
  public final static native int bdd_veccompose(int jarg1, long jarg2);
  public final static native int bdd_simplify(int jarg1, int jarg2);
  public final static native int bdd_exist(int jarg1, int jarg2);
  public final static native int bdd_forall(int jarg1, int jarg2);
  public final static native int bdd_unique(int jarg1, int jarg2);
  public final static native int bdd_appex(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int bdd_appall(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int bdd_appuni(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int bdd_support(int jarg1);
  public final static native int bdd_satone(int jarg1);
  public final static native int bdd_satoneset(int jarg1, int jarg2, int jarg3);
  public final static native int bdd_fullsatone(int jarg1);
  public final static native void bdd_allsat(int jarg1, long jarg2);
  public final static native double bdd_satcount(int jarg1);
  public final static native double bdd_satcountset(int jarg1, int jarg2);
  public final static native double bdd_satcountln(int jarg1);
  public final static native double bdd_satcountlnset(int jarg1, int jarg2);
  public final static native int bdd_nodecount(int jarg1);
  public final static native int bdd_anodecount(long jarg1, int jarg2);
  public final static native long bdd_varprofile(int jarg1);
  public final static native double bdd_pathcount(int jarg1);
  public final static native void bdd_printall();
  public final static native void bdd_fprintall(long jarg1);
  public final static native void bdd_fprinttable(long jarg1, int jarg2);
  public final static native void bdd_printtable(int jarg1);
  public final static native void bdd_fprintset(long jarg1, int jarg2);
  public final static native void bdd_printset(int jarg1);
  public final static native int bdd_fnprintdot(String jarg1, int jarg2);
  public final static native void bdd_fprintdot(long jarg1, int jarg2);
  public final static native void bdd_printdot(int jarg1);
  public final static native int bdd_fnsave(String jarg1, int jarg2);
  public final static native int bdd_save(long jarg1, int jarg2);
  public final static native int bdd_fnload(String jarg1, long jarg2);
  public final static native int bdd_load(long jarg1, long jarg2);
  public final static native int bdd_swapvar(int jarg1, int jarg2);
  public final static native void bdd_default_reohandler(int jarg1);
  public final static native void bdd_reorder(int jarg1);
  public final static native int bdd_reorder_gain();
  public final static native long bdd_reorder_probe(long jarg1);
  public final static native void bdd_clrvarblocks();
  public final static native int bdd_addvarblock(int jarg1, int jarg2);
  public final static native int bdd_intaddvarblock(int jarg1, int jarg2, int jarg3);
  public final static native void bdd_varblockall();
  public final static native long bdd_blockfile_hook(long jarg1);
  public final static native int bdd_autoreorder(int jarg1);
  public final static native int bdd_autoreorder_times(int jarg1, int jarg2);
  public final static native int bdd_var2level(int jarg1);
  public final static native int bdd_level2var(int jarg1);
  public final static native int bdd_getreorder_times();
  public final static native int bdd_getreorder_method();
  public final static native void bdd_enable_reorder();
  public final static native void bdd_disable_reorder();
  public final static native int bdd_reorder_verbose(int jarg1);
  public final static native void bdd_setvarorder(int[] jarg1);
  public final static native void bdd_printorder();
  public final static native void bdd_fprintorder(long jarg1);
  public final static native int get_bddfalse();
  public final static native int get_bddtrue();
  public final static native int get_BDD_REORDER_NONE();
  public final static native int get_BDD_REORDER_WIN2();
  public final static native int get_BDD_REORDER_WIN2ITE();
  public final static native int get_BDD_REORDER_SIFT();
  public final static native int get_BDD_REORDER_SIFTITE();
  public final static native int get_BDD_REORDER_WIN3();
  public final static native int get_BDD_REORDER_WIN3ITE();
  public final static native int get_BDD_REORDER_RANDOM();
  public final static native int get_BDD_REORDER_FREE();
  public final static native int get_BDD_REORDER_FIXED();
  public final static native int get_BDD_MEMORY();
  public final static native int get_BDD_VAR();
  public final static native int get_BDD_RANGE();
  public final static native int get_BDD_DEREF();
  public final static native int get_BDD_RUNNING();
  public final static native int get_BDD_FILE();
  public final static native int get_BDD_FORMAT();
  public final static native int get_BDD_ORDER();
  public final static native int get_BDD_BREAK();
  public final static native int get_BDD_VARNUM();
  public final static native int get_BDD_NODES();
  public final static native int get_BDD_OP();
  public final static native int get_BDD_VARSET();
  public final static native int get_BDD_VARBLK();
  public final static native int get_BDD_DECVNUM();
  public final static native int get_BDD_REPLACE();
  public final static native int get_BDD_NODENUM();
  public final static native int get_BDD_ILLBDD();
  public final static native int get_BDD_SIZE();
  public final static native int get_BVEC_SIZE();
  public final static native int get_BVEC_SHIFT();
  public final static native int get_BVEC_DIVZERO();
  public final static native int get_BDD_ERRNUM();
  public final static native void set_Domain_realsize(long jarg1, int jarg2);
  public final static native int get_Domain_realsize(long jarg1);
  public final static native void set_Domain_binsize(long jarg1, int jarg2);
  public final static native int get_Domain_binsize(long jarg1);
  public final static native void set_Domain_ivar(long jarg1, long jarg2);
  public final static native long get_Domain_ivar(long jarg1);
  public final static native void set_Domain_var(long jarg1, int jarg2);
  public final static native int get_Domain_var(long jarg1);
  public final static native long new_Domain();
  public final static native void delete_Domain(long jarg1);
  public final static native void set_domain(long jarg1);
  public final static native long get_domain();
  public final static native int fdd_extdomain(int[] jarg1, int jarg2);
  public final static native int fdd_overlapdomain(int jarg1, int jarg2);
  public final static native void fdd_clearall();
  public final static native int fdd_domainnum();
  public final static native int fdd_domainsize(int jarg1);
  public final static native int fdd_varnum(int jarg1);
  public final static native long fdd_vars(int jarg1);
  public final static native int fdd_ithvar(int jarg1, int jarg2);
  public final static native int fdd_scanvar(int jarg1, int jarg2);
  public final static native long fdd_scanallvar(int jarg1);
  public final static native int fdd_ithset(int jarg1);
  public final static native int fdd_domain(int jarg1);
  public final static native int fdd_equals(int jarg1, int jarg2);
  public final static native long fdd_file_hook(long jarg1);
  public final static native void fdd_printset(int jarg1);
  public final static native void fdd_fprintset(long jarg1, int jarg2);
  public final static native int fdd_scanset(int jarg1, long jarg2, long jarg3);
  public final static native int fdd_makeset(long jarg1, int jarg2);
  public final static native int fdd_intaddvarblock(int jarg1, int jarg2, int jarg3);
  public final static native int fdd_setpair(long jarg1, int jarg2, int jarg3);
  public final static native int fdd_setpairs(long jarg1, long jarg2, long jarg3, int jarg4);
  public final static native int fdd_allsat(int jarg1, int jarg2, int[] jarg3);
  public final static native int fdd_satcount(int jarg1, int jarg2);
  public final static native void fdd_getvars(int[] jarg1, int jarg2);
}