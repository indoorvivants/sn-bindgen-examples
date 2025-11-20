#include <string.h>
#include "libavformat/avformat.h"
#include "libavcodec/avcodec.h"
#include "libavutil/avutil.h"
#include "libavutil/log.h"

void __sn_wrap_ffmpeg_av_add_q(AVRational *b, AVRational *c, AVRational *____return) {
  AVRational ____ret = av_add_q(*b, *c);
  memcpy(____return, &____ret, sizeof(AVRational));
}


int64_t __sn_wrap_ffmpeg_av_add_stable(AVRational *ts_tb, int64_t ts, AVRational *inc_tb, int64_t inc) {
 return av_add_stable(*ts_tb, ts, *inc_tb, inc);
};


int __sn_wrap_ffmpeg_av_cmp_q(AVRational *a, AVRational *b) {
 return av_cmp_q(*a, *b);
};


int __sn_wrap_ffmpeg_av_compare_ts(int64_t ts_a, AVRational *tb_a, int64_t ts_b, AVRational *tb_b) {
 return av_compare_ts(ts_a, *tb_a, ts_b, *tb_b);
};


void __sn_wrap_ffmpeg_av_d2q(double d, int max, AVRational *____return) {
  AVRational ____ret = av_d2q(d, max);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_div_q(AVRational *b, AVRational *c, AVRational *____return) {
  AVRational ____ret = av_div_q(*b, *c);
  memcpy(____return, &____ret, sizeof(AVRational));
}


int __sn_wrap_ffmpeg_av_find_nearest_q_idx(AVRational *q, const AVRational * q_list) {
 return av_find_nearest_q_idx(*q, q_list);
};


void __sn_wrap_ffmpeg_av_gcd_q(AVRational *a, AVRational *b, int max_den, AVRational *def, AVRational *____return) {
  AVRational ____ret = av_gcd_q(*a, *b, max_den, *def);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_get_time_base_q(AVRational *____return) {
  AVRational ____ret = av_get_time_base_q();
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_guess_frame_rate(AVFormatContext * ctx, AVStream * stream, struct AVFrame * frame, AVRational *____return) {
  AVRational ____ret = av_guess_frame_rate(ctx, stream, frame);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_guess_sample_aspect_ratio(AVFormatContext * format, AVStream * stream, struct AVFrame * frame, AVRational *____return) {
  AVRational ____ret = av_guess_sample_aspect_ratio(format, stream, frame);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_inv_q(AVRational *q, AVRational *____return) {
  AVRational ____ret = av_inv_q(*q);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_make_q(int num, int den, AVRational *____return) {
  AVRational ____ret = av_make_q(num, den);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_mul_q(AVRational *b, AVRational *c, AVRational *____return) {
  AVRational ____ret = av_mul_q(*b, *c);
  memcpy(____return, &____ret, sizeof(AVRational));
}


int __sn_wrap_ffmpeg_av_nearer_q(AVRational *q, AVRational *q1, AVRational *q2) {
 return av_nearer_q(*q, *q1, *q2);
};


void __sn_wrap_ffmpeg_av_packet_rescale_ts(AVPacket * pkt, AVRational *tb_src, AVRational *tb_dst) {
 av_packet_rescale_ts(pkt, *tb_src, *tb_dst);
};


double __sn_wrap_ffmpeg_av_q2d(AVRational *a) {
 return av_q2d(*a);
};


uint32_t __sn_wrap_ffmpeg_av_q2intfloat(AVRational *q) {
 return av_q2intfloat(*q);
};


int64_t __sn_wrap_ffmpeg_av_rescale_delta(AVRational *in_tb, int64_t in_ts, AVRational *fs_tb, int duration, int64_t * last, AVRational *out_tb) {
 return av_rescale_delta(*in_tb, in_ts, *fs_tb, duration, last, *out_tb);
};


int64_t __sn_wrap_ffmpeg_av_rescale_q(int64_t a, AVRational *bq, AVRational *cq) {
 return av_rescale_q(a, *bq, *cq);
};


int64_t __sn_wrap_ffmpeg_av_rescale_q_rnd(int64_t a, AVRational *bq, AVRational *cq, enum AVRounding rnd) {
 return av_rescale_q_rnd(a, *bq, *cq, rnd);
};


void __sn_wrap_ffmpeg_av_stream_get_codec_timebase(const AVStream * st, AVRational *____return) {
  AVRational ____ret = av_stream_get_codec_timebase(st);
  memcpy(____return, &____ret, sizeof(AVRational));
}


void __sn_wrap_ffmpeg_av_sub_q(AVRational *b, AVRational *c, AVRational *____return) {
  AVRational ____ret = av_sub_q(*b, *c);
  memcpy(____return, &____ret, sizeof(AVRational));
}